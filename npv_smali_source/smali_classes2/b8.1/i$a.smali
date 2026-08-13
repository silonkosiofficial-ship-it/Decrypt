.class final Lb8/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ln8/f;

.field private final b:Le8/g;


# direct methods
.method public constructor <init>(Ln8/f;Le8/g;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/i$a;->a:Ln8/f;

    iput-object p2, p0, Lb8/i$a;->b:Le8/g;

    return-void
.end method


# virtual methods
.method public final a()Le8/g;
    .locals 1

    iget-object v0, p0, Lb8/i$a;->b:Le8/g;

    return-object v0
.end method

.method public final b()Ln8/f;
    .locals 1

    iget-object v0, p0, Lb8/i$a;->a:Ln8/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Lb8/i$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb8/i$a;->a:Ln8/f;

    check-cast p1, Lb8/i$a;

    iget-object p1, p1, Lb8/i$a;->a:Ln8/f;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb8/i$a;->a:Ln8/f;

    invoke-virtual {v0}, Ln8/f;->hashCode()I

    move-result v0

    return v0
.end method
