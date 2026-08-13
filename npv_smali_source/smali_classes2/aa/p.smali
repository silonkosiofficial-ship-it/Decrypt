.class public abstract Laa/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Laa/n;
    .locals 7

    .prologue
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v2, v1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0x30

    const/16 v3, 0x20

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget v1, v1, Landroid/content/res/Configuration;->densityDpi:I

    new-instance v3, Laa/n;

    new-instance v4, Laa/i;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getLanguage(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5}, Laa/i;-><init>(Ljava/lang/String;)V

    new-instance v5, Laa/l;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v6, "getCountry(...)"

    invoke-static {v0, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v0}, Laa/l;-><init>(Ljava/lang/String;)V

    sget-object v0, Laa/C;->C:Laa/C$a;

    invoke-virtual {v0, v2}, Laa/C$a;->a(Z)Laa/C;

    move-result-object v0

    sget-object v2, Laa/c;->D:Laa/c$a;

    invoke-virtual {v2, v1}, Laa/c$a;->b(I)Laa/c;

    move-result-object v1

    invoke-direct {v3, v4, v5, v0, v1}, Laa/n;-><init>(Laa/i;Laa/l;Laa/C;Laa/c;)V

    return-object v3
.end method
