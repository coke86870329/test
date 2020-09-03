//package cn.xdf.myapplication.aidl
//
//import android.os.Parcel
//import android.os.Parcelable
//
// class Book : Parcelable {
//    var bookId: Int
//    var bookName: String?
//
//    protected constructor(`in`: Parcel) {
//        bookId = `in`.readInt()
//        bookName = `in`.readString()
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    override fun writeToParcel(dest: Parcel, flags: Int) {
//        dest.writeInt(bookId)
//        dest.writeString(bookName)
//    }
//
//    private constructor(bookId: Int, bookName: String) {
//        this.bookName = bookName
//        this.bookId = bookId
//    }
//
//    companion object {
//        val CREATOR: Parcelable.Creator<Book?> = object : Parcelable.Creator<Book?> {
//            override fun createFromParcel(`in`: Parcel): Book? {
//                return Book(`in`)
//            }
//
//            override fun newArray(size: Int): Array<Book?> {
//                return arrayOfNulls(size)
//            }
//        }
//    }
//}