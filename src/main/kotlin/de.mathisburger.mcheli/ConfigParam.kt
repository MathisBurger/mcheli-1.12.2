package de.mathisburger.mcheli

class ConfigParam {

    val type: Int;

    val name: String

    var paramInt: Int = 0;

    var paramString: String = "";

    var paramBool: Boolean = false;

    var paramDouble: Double = 0.0;

    var desc: String = "";

    var paramIntDefault: Int = 0;

    var validVer: String = "";

    override fun toString(): String {
        if (this.type == 0)
            return this.paramInt.toString();
        if (this.type == 1)
            return this.paramString;
        if (this.type == 2)
            return this.paramBool.toString()
        if (this.type == 3)
            return String.format("%.2f", this.paramDouble.toString()).replace(',', '.');
        return "";
    }

    constructor(parameterName: String, defaultParameter: Int) {
        this.paramInt = defaultParameter;
        this.paramIntDefault = defaultParameter;
        this.type = 0;
        this.name = parameterName;
    }

    constructor(parameterName: String, defaultParameter: String) {
        this.paramString = defaultParameter;
        this.type = 1;
        this.name = parameterName;
    }

    constructor(parameterName: String, defaultParameter: Boolean) {
        this.paramBool = defaultParameter;
        this.type = 2;
        this.name = parameterName;
    }

    constructor(parameterName: String, defaultParameter: Double) {
        this.paramDouble = defaultParameter;
        this.type = 3;
        this.name = parameterName;
    }

    fun compare(s: String): Boolean {
        return this.name.equals(s, true);
    }

    fun isValidVer(configVer: String): Boolean {
        if (configVer.length >= 5 && validVer.length >= 5) {
            val configVerSplit: List<String> = configVer.split("\\.")
            val validVerSplit = validVer.split("\\.".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
            if (configVerSplit.size == 3 && validVerSplit.size == 3) for (i in 0..2) {
                val n1 =
                    Integer.valueOf(configVerSplit[i].replace("[a-zA-Z-_]".toRegex(), "").trim { it <= ' ' }).toInt()
                val n2 =
                    Integer.valueOf(validVerSplit[i].replace("[a-zA-Z-_]".toRegex(), "").trim { it <= ' ' }).toInt()
                if (n1 > n2) return true
                if (n1 < n2) return false
            }
        }
        return true
    }

    fun setPrm(n: Int) {
        if (type == 0) this.paramInt = n
    }

    fun setPrm(s: String) {
        var s = s
        if (type == 0) this.paramInt = s.toInt()
        if (type == 1) this.paramString = s
        if (type == 2) {
            s = s.toLowerCase()
            if (s.compareTo("true") == 0) this.paramBool = true
            if (s.compareTo("false") == 0) this.paramBool = false
        }
        if (type == 3 && s.isNotEmpty()) this.paramDouble = Lib.parseDouble(s)
    }

    fun setPrm(b: Boolean) {
        if (type == 2) this.paramBool = b
    }

    fun setPrm(f: Double) {
        if (type == 3) this.paramDouble = f
    }
}
