package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Image;
import com.example.MiapiEnzoRH.repositories.ImageRepository;
import org.springframework.stereotype.Service;

@Service
public class ImageService extends BaseService<Image, Long>{
    public ImageService(ImageRepository imageRepository) {
        super(imageRepository);
    }
}
