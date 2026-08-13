.class final LS/Y0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS/b1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/Y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:LS/W0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLS/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/Y0$b;->a:Ljava/lang/String;

    iput-object p2, p0, LS/Y0$b;->b:Ljava/lang/String;

    iput-boolean p3, p0, LS/Y0$b;->c:Z

    iput-object p4, p0, LS/Y0$b;->d:LS/W0;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LS/Y0$b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LS/Y0$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()LS/W0;
    .locals 1

    iget-object v0, p0, LS/Y0$b;->d:LS/W0;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LS/Y0$b;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LS/Y0$b;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LS/Y0$b;

    invoke-virtual {p0}, LS/Y0$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LS/Y0$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, LS/Y0$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LS/Y0$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, LS/Y0$b;->d()Z

    move-result v2

    invoke-virtual {p1}, LS/Y0$b;->d()Z

    move-result v3

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    invoke-virtual {p0}, LS/Y0$b;->c()LS/W0;

    move-result-object v2

    invoke-virtual {p1}, LS/Y0$b;->c()LS/W0;

    move-result-object p1

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .prologue
    invoke-virtual {p0}, LS/Y0$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LS/Y0$b;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LS/Y0$b;->d()Z

    move-result v1

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LS/Y0$b;->c()LS/W0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
