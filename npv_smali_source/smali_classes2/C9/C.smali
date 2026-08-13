.class public abstract LC9/C;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Z)LC9/B$d;
    .locals 1

    const-string v0, "route"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LC9/B$d;

    invoke-direct {v0, p0, p1}, LC9/B$d;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;ZILjava/lang/Object;)LC9/B$d;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LC9/C;->a(Ljava/lang/String;Z)LC9/B$d;

    move-result-object p0

    return-object p0
.end method
