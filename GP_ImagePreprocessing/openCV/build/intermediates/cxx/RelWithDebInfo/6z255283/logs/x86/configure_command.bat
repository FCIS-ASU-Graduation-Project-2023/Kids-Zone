@echo off
"C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\cmake\\3.22.1\\bin\\cmake.exe" ^
  "-HC:\\Huda\\FCIS\\4th Year\\Graduation Project\\Android Studio Repo Branch\\GP_ImagePreprocessing\\openCV\\libcxx_helper" ^
  "-DCMAKE_SYSTEM_NAME=Android" ^
  "-DCMAKE_EXPORT_COMPILE_COMMANDS=ON" ^
  "-DCMAKE_SYSTEM_VERSION=24" ^
  "-DANDROID_PLATFORM=android-24" ^
  "-DANDROID_ABI=x86" ^
  "-DCMAKE_ANDROID_ARCH_ABI=x86" ^
  "-DANDROID_NDK=C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620" ^
  "-DCMAKE_ANDROID_NDK=C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620" ^
  "-DCMAKE_TOOLCHAIN_FILE=C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620\\build\\cmake\\android.toolchain.cmake" ^
  "-DCMAKE_MAKE_PROGRAM=C:\\Users\\AZ\\AppData\\Local\\Android\\Sdk\\cmake\\3.22.1\\bin\\ninja.exe" ^
  "-DCMAKE_LIBRARY_OUTPUT_DIRECTORY=C:\\Huda\\FCIS\\4th Year\\Graduation Project\\Android Studio Repo Branch\\GP_ImagePreprocessing\\openCV\\build\\intermediates\\cxx\\RelWithDebInfo\\6z255283\\obj\\x86" ^
  "-DCMAKE_RUNTIME_OUTPUT_DIRECTORY=C:\\Huda\\FCIS\\4th Year\\Graduation Project\\Android Studio Repo Branch\\GP_ImagePreprocessing\\openCV\\build\\intermediates\\cxx\\RelWithDebInfo\\6z255283\\obj\\x86" ^
  "-DCMAKE_BUILD_TYPE=RelWithDebInfo" ^
  "-BC:\\Huda\\FCIS\\4th Year\\Graduation Project\\Android Studio Repo Branch\\GP_ImagePreprocessing\\openCV\\.cxx\\RelWithDebInfo\\6z255283\\x86" ^
  -GNinja ^
  "-DANDROID_STL=c++_shared"
