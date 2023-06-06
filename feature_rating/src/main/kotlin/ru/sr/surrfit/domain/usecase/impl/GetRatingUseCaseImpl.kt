package ru.sr.surrfit.domain.usecase.impl

import ru.sr.surrfit.domain.model.RatingDomainModel
import ru.sr.surrfit.domain.repository.RatingLocalRepository
import ru.sr.surrfit.domain.usecase.GetRatingUseCase

class GetRatingUseCaseImpl(
    private val repository: RatingLocalRepository,
) : GetRatingUseCase {
    override suspend fun getItemsByFilter(filter: String): List<RatingDomainModel> {
        return repository.getAllItems()
    }

}