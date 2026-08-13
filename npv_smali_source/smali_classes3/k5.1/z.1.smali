.class public abstract Lk5/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ln5/F;Ljava/lang/String;Ljava/io/File;)Lk5/z;
    .locals 1

    new-instance v0, Lk5/b;

    invoke-direct {v0, p0, p1, p2}, Lk5/b;-><init>(Ln5/F;Ljava/lang/String;Ljava/io/File;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ln5/F;
.end method

.method public abstract c()Ljava/io/File;
.end method

.method public abstract d()Ljava/lang/String;
.end method
