@echo off
"C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\cmake\\3.22.1\\bin\\cmake.exe" ^
  "-HC:\\Huda\\FCIS\\4th Year\\Graduation Project\\Android Studio Repo Branch (GP)\\FullProject\\KidsZone\\OpenCV\\libcxx_helper" ^
  "-DCMAKE_SYSTEM_NAME=Android" ^
  "-DCMAKE_EXPORT_COMPILE_COMMANDS=ON" ^
  "-DCMAKE_SYSTEM_VERSION=26" ^
  "-DANDROID_PLATFORM=android-26" ^
  "-DANDROID_ABI=arm64-v8a" ^
  "-DCMAKE_ANDROID_ARCH_ABI=arm64-v8a" ^
  "-DANDROID_NDK=C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620" ^
  "-DCMAKE_ANDROID_NDK=C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620" ^
  "-DCMAKE_TOOLCHAIN_FILE=C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620\\build\\cmake\\android.toolchain.cmake" ^
  "-DCMAKE_MAKE_PROGRAM=C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\cmake\\3.22.1\\bin\\ninja.exe" ^
  "-DCMAKE_LIBRARY_OUTPUT_DIRECTORY=C:\\Huda\\FCIS\\4th Year\\Graduation Project\\Android Studio Repo Branch (GP)\\FullProject\\KidsZone\\OpenCV\\build\\intermediates\\cxx\\Debug\\1x2j2m6k\\obj\\arm64-v8a" ^
  "-DCMAKE_RUNTIME_OUTPUT_DIRECTORY=C:\\Huda\\FCIS\\4th Year\\Graduation Project\\Android Studio Repo Branch (GP)\\FullProject\\KidsZone\\OpenCV\\build\\intermediates\\cxx\\Debug\\1x2j2m6k\\obj\\arm64-v8a" ^
  "-DCMAKE_BUILD_TYPE=Debug" ^
  "-BC:\\Huda\\FCIS\\4th Year\\Graduation Project\\Android Studio Repo Branch (GP)\\FullProject\\KidsZone\\OpenCV\\.cxx\\Debug\\1x2j2m6k\\arm64-v8a" ^
  -GNinja ^
  "-DANDROID_STL=c++_shared"
