.class public abstract Lg8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/G;LO7/J;LE8/n;Lg8/r;Lm8/e;)Lg8/e;
    .locals 1

    const-string v0, "module"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg8/e;

    invoke-direct {v0, p0, p1, p2, p3}, Lg8/e;-><init>(LO7/G;LO7/J;LE8/n;Lg8/r;)V

    invoke-virtual {v0, p4}, Lg8/e;->N(Lm8/e;)V

    return-object v0
.end method
