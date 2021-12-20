Scenarios:

1. No feature flags, fail to specify bare minimum config
   1. Run `./gradlew bootRun`
2. Run app with minimum config via the dev profile
   1. Run `SPRING_PROFILES_ACTIVE=dev ./gradlew bootRun`
3. Run app with permissive color feature
   1. Run `SPRING_PROFILES_ACTIVE=dev,color ./gradlew bootRun`
   2. Notice that the app starts correctly, but `http://localhost:8080/api/color` does not return anything
   3. Consider this a soft configuration error
4. Run app with strict shape feature
   1. Run `SPRING_PROFILES_ACTIVE=dev,shape ./gradlew bootRun`
   2. Notice the app will not start up because it tries to look for the "favorite" env var but cannot find it
   3. Fix by specifying config with `SPRING_PROFILES_ACTIVE=dev,shape FAVORITE=Triangle ./gradlew bootRun`
   4. This feature is structured better than color because it strictly requires all config to successfully activate
5. Turn on everything
   1. Run `SPRING_PROFILES_ACTIVE=dev,color,shape FAVORITE=Triangle ./gradlew bootRun`
   2. Visit `http://localhost:8080/actuator/env` to debug where the env vars came from and their resolved values
   