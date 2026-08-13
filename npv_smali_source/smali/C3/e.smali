.class abstract LC3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LC3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC3/d;

    invoke-direct {v0}, LC3/d;-><init>()V

    sput-object v0, LC3/e;->a:LC3/d;

    return-void
.end method

.method static bridge synthetic a()LC3/d;
    .locals 1

    sget-object v0, LC3/e;->a:LC3/d;

    return-object v0
.end method
