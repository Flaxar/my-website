# This file was manually created to bundle gradle and react compilation and server start afterwards
gradleDir=$(pwd)
cd "app/src/main/resources/files/my-app"
# Builds the static frontend files 
npm run build
cd $gradleDir
# Build and run server
./gradlew run
