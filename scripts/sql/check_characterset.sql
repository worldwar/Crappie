SELECT character_set_name, collation_name
    FROM information_schema.columns
    WHERE table_schema = crappie
        AND table_name = article
        AND column_name = title;