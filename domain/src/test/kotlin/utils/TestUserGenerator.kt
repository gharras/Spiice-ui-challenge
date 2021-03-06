package utils

import com.cheise_proj.domain.entities.user.PortfolioEntity
import com.cheise_proj.domain.entities.user.ProfileEntity
import com.cheise_proj.domain.entities.user.ReviewsEntity
import com.cheise_proj.domain.entities.user.UserEntity

object TestUserGenerator {
    fun getUser(): UserEntity {
        return UserEntity(
            email = "test email",
            avatarUrl = "http://testavatar",
            name = "test user name",
            userId = "test uid",
            accessToken = "test access token",
            refreshToken = "test refresh token"
        )
    }

    fun getProfile(): ProfileEntity {
        return ProfileEntity(
            jobTitle = "test job title",
            description = "test description",
            user = getUser(),
            reviews = arrayListOf(
                ReviewsEntity(
                    content = "test content",
                    timestamp = "2020-03-31T15:45:28.627Z",
                    rating = 4f,
                    id = "test uid",
                    sender = getUser()
                )
            ),
            portfolio = arrayListOf(
                PortfolioEntity(
                    screenShotUrl = "http://testscreenshot"
                )
            )
        )
    }
}