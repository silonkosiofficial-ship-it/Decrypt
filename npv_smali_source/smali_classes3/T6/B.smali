.class public final LT6/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT6/B$a;
    }
.end annotation


# static fields
.field public static final d:LT6/B$a;

.field private static final e:LT6/B;

.field private static final f:LT6/B;

.field private static final g:LT6/B;

.field private static final h:LT6/B;

.field private static final i:LT6/B;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LT6/B$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT6/B$a;-><init>(Ly7/k;)V

    sput-object v0, LT6/B;->d:LT6/B$a;

    new-instance v0, LT6/B;

    const-string v1, "HTTP"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LT6/B;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT6/B;->e:LT6/B;

    new-instance v0, LT6/B;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LT6/B;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT6/B;->f:LT6/B;

    new-instance v0, LT6/B;

    invoke-direct {v0, v1, v2, v3}, LT6/B;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT6/B;->g:LT6/B;

    new-instance v0, LT6/B;

    const-string v1, "SPDY"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v3}, LT6/B;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT6/B;->h:LT6/B;

    new-instance v0, LT6/B;

    const-string v1, "QUIC"

    invoke-direct {v0, v1, v2, v3}, LT6/B;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT6/B;->i:LT6/B;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/B;->a:Ljava/lang/String;

    iput p2, p0, LT6/B;->b:I

    iput p3, p0, LT6/B;->c:I

    return-void
.end method

.method public static final synthetic a()LT6/B;
    .locals 1

    sget-object v0, LT6/B;->g:LT6/B;

    return-object v0
.end method

.method public static final synthetic b()LT6/B;
    .locals 1

    sget-object v0, LT6/B;->f:LT6/B;

    return-object v0
.end method

.method public static final synthetic c()LT6/B;
    .locals 1

    sget-object v0, LT6/B;->e:LT6/B;

    return-object v0
.end method

.method public static final synthetic d()LT6/B;
    .locals 1

    sget-object v0, LT6/B;->i:LT6/B;

    return-object v0
.end method

.method public static final synthetic e()LT6/B;
    .locals 1

    sget-object v0, LT6/B;->h:LT6/B;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LT6/B;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LT6/B;

    iget-object v1, p0, LT6/B;->a:Ljava/lang/String;

    iget-object v3, p1, LT6/B;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LT6/B;->b:I

    iget v3, p1, LT6/B;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, LT6/B;->c:I

    iget p1, p1, LT6/B;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LT6/B;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LT6/B;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LT6/B;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LT6/B;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, LT6/B;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, LT6/B;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
