package com.danbamitale.epmslib.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.danbamitale.epmslib.utils.Utility
import com.danbamitale.epmslib.utils.Utility.POS_VAS_NIBSS_DEFAULT_IP
import com.danbamitale.epmslib.utils.Utility.POS_VAS_NIBSS_DEFAULT_PORT
import kotlinx.android.parcel.Parcelize
import java.io.File
import java.io.FileNotFoundException

val certificateFile: File? = try {
    File(Utility.NIBSS_CERT_PATH)
} catch (e: FileNotFoundException) {
    null
}

@Parcelize
@Entity
data class ConnectionData
/**
 *
 * @param ipAddress
 * @param ipPort
 * @param isSSL
 * @param certFile
 */(
    var ipAddress: String = POS_VAS_NIBSS_DEFAULT_IP,
    var ipPort: Int = POS_VAS_NIBSS_DEFAULT_PORT,
    var isSSL: Boolean = true,
    var certFile: File? = certificateFile,
) : Parcelable {
    @PrimaryKey
    var id = 1
}
