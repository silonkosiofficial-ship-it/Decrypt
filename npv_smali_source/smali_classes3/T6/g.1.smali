.class public final LT6/g;
.super LT6/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT6/g$a;
    }
.end annotation


# static fields
.field public static final d:LT6/g$a;

.field private static final e:LT6/g;

.field private static final f:LT6/g;

.field private static final g:LT6/g;

.field private static final h:LT6/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LT6/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT6/g$a;-><init>(Ly7/k;)V

    sput-object v0, LT6/g;->d:LT6/g$a;

    new-instance v0, LT6/g;

    const-string v2, "file"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v1, v3, v1}, LT6/g;-><init>(Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/g;->e:LT6/g;

    new-instance v0, LT6/g;

    const-string v2, "mixed"

    invoke-direct {v0, v2, v1, v3, v1}, LT6/g;-><init>(Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/g;->f:LT6/g;

    new-instance v0, LT6/g;

    const-string v2, "attachment"

    invoke-direct {v0, v2, v1, v3, v1}, LT6/g;-><init>(Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/g;->g:LT6/g;

    new-instance v0, LT6/g;

    const-string v2, "inline"

    invoke-direct {v0, v2, v1, v3, v1}, LT6/g;-><init>(Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/g;->h:LT6/g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const-string v0, "disposition"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LT6/n;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, LT6/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LT6/n;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LT6/g;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LT6/g;->d()Ljava/lang/String;

    move-result-object v0

    check-cast p1, LT6/g;

    invoke-virtual {p1}, LT6/g;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LT6/n;->b()Ljava/util/List;

    move-result-object p1

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
    .locals 2

    invoke-virtual {p0}, LT6/g;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
