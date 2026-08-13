.class public final LT6/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT6/A$a;
    }
.end annotation


# static fields
.field public static final b:LT6/A$a;

.field private static final c:LT6/A;

.field private static final d:LT6/A;

.field private static final e:LT6/A;

.field private static final f:LT6/A;

.field private static final g:LT6/A;

.field private static final h:LT6/A;

.field private static final i:LT6/A;

.field private static final j:Ljava/util/List;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LT6/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT6/A$a;-><init>(Ly7/k;)V

    sput-object v0, LT6/A;->b:LT6/A$a;

    new-instance v0, LT6/A;

    const-string v1, "GET"

    invoke-direct {v0, v1}, LT6/A;-><init>(Ljava/lang/String;)V

    sput-object v0, LT6/A;->c:LT6/A;

    new-instance v1, LT6/A;

    const-string v2, "POST"

    invoke-direct {v1, v2}, LT6/A;-><init>(Ljava/lang/String;)V

    sput-object v1, LT6/A;->d:LT6/A;

    new-instance v2, LT6/A;

    const-string v3, "PUT"

    invoke-direct {v2, v3}, LT6/A;-><init>(Ljava/lang/String;)V

    sput-object v2, LT6/A;->e:LT6/A;

    new-instance v3, LT6/A;

    const-string v4, "PATCH"

    invoke-direct {v3, v4}, LT6/A;-><init>(Ljava/lang/String;)V

    sput-object v3, LT6/A;->f:LT6/A;

    new-instance v4, LT6/A;

    const-string v5, "DELETE"

    invoke-direct {v4, v5}, LT6/A;-><init>(Ljava/lang/String;)V

    sput-object v4, LT6/A;->g:LT6/A;

    new-instance v5, LT6/A;

    const-string v6, "HEAD"

    invoke-direct {v5, v6}, LT6/A;-><init>(Ljava/lang/String;)V

    sput-object v5, LT6/A;->h:LT6/A;

    new-instance v6, LT6/A;

    const-string v7, "OPTIONS"

    invoke-direct {v6, v7}, LT6/A;-><init>(Ljava/lang/String;)V

    sput-object v6, LT6/A;->i:LT6/A;

    const/4 v7, 0x7

    new-array v7, v7, [LT6/A;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v0, 0x2

    aput-object v2, v7, v0

    const/4 v0, 0x3

    aput-object v3, v7, v0

    const/4 v0, 0x4

    aput-object v4, v7, v0

    const/4 v0, 0x5

    aput-object v5, v7, v0

    const/4 v0, 0x6

    aput-object v6, v7, v0

    invoke-static {v7}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LT6/A;->j:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/A;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()LT6/A;
    .locals 1

    sget-object v0, LT6/A;->c:LT6/A;

    return-object v0
.end method

.method public static final synthetic b()LT6/A;
    .locals 1

    sget-object v0, LT6/A;->h:LT6/A;

    return-object v0
.end method

.method public static final synthetic c()LT6/A;
    .locals 1

    sget-object v0, LT6/A;->d:LT6/A;

    return-object v0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/A;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LT6/A;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LT6/A;

    iget-object v1, p0, LT6/A;->a:Ljava/lang/String;

    iget-object p1, p1, LT6/A;->a:Ljava/lang/String;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LT6/A;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpMethod(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT6/A;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
