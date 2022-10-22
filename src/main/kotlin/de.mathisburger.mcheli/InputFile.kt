package de.mathisburger.mcheli

import java.io.*


class InputFile {
    var file: File? = null
    var br: BufferedReader? = null


    fun open(path: String): Boolean {
        close()
        file = File(path)
        val filePath: String? = file?.absolutePath
        try {
            br = BufferedReader(FileReader(file))
        } catch (e: FileNotFoundException) {
            MCH_Lib.DbgLog(true, "FILE open failed MCH_InputFile.open:$filePath", arrayOfNulls<Any>(0))
            e.printStackTrace()
            return false
        }
        return true
    }

    fun openUTF8(file: File): Boolean {
        return openUTF8(file.getPath())
    }

    fun openUTF8(path: String?): Boolean {
        close()
        file = File(path)
        try {
            br = BufferedReader(InputStreamReader(FileInputStream(file), "UTF-8"))
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
        return true
    }

    fun readLine(): String? {
        return try {
            if (br != null) br!!.readLine() else null
        } catch (e: IOException) {
            null
        }
    }

    fun close() {
        try {
            if (br != null) br!!.close()
        } catch (e: IOException) {
        }
        br = null
    }
}
