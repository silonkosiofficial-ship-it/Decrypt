.class public final Lm8/e;
.super Lk8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm8/e$a;
    }
.end annotation


# static fields
.field public static final h:Lm8/e$a;

.field public static final i:Lm8/e;

.field public static final j:Lm8/e;

.field public static final k:Lm8/e;


# instance fields
.field private final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lm8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm8/e$a;-><init>(Ly7/k;)V

    sput-object v0, Lm8/e;->h:Lm8/e$a;

    new-instance v0, Lm8/e;

    const/4 v1, 0x1

    const/16 v2, 0x9

    const/4 v3, 0x0

    filled-new-array {v1, v2, v3}, [I

    move-result-object v1

    invoke-direct {v0, v1}, Lm8/e;-><init>([I)V

    sput-object v0, Lm8/e;->i:Lm8/e;

    invoke-virtual {v0}, Lm8/e;->m()Lm8/e;

    move-result-object v0

    sput-object v0, Lm8/e;->j:Lm8/e;

    new-instance v0, Lm8/e;

    new-array v1, v3, [I

    invoke-direct {v0, v1}, Lm8/e;-><init>([I)V

    sput-object v0, Lm8/e;->k:Lm8/e;

    return-void
.end method

.method public varargs constructor <init>([I)V
    .locals 1

    const-string v0, "numbers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lm8/e;-><init>([IZ)V

    return-void
.end method

.method public constructor <init>([IZ)V
    .locals 1

    const-string v0, "versionArray"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-direct {p0, p1}, Lk8/a;-><init>([I)V

    iput-boolean p2, p0, Lm8/e;->g:Z

    return-void
.end method

.method private final i(Lm8/e;)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, Lk8/a;->a()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lk8/a;->b()I

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lk8/a;->a()I

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, p1}, Lm8/e;->l(Lm8/e;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1
.end method

.method private final l(Lm8/e;)Z
    .locals 4

    .prologue
    invoke-virtual {p0}, Lk8/a;->a()I

    move-result v0

    invoke-virtual {p1}, Lk8/a;->a()I

    move-result v1

    const/4 v2, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lk8/a;->a()I

    move-result v0

    invoke-virtual {p1}, Lk8/a;->a()I

    move-result v1

    const/4 v3, 0x0

    if-ge v0, v1, :cond_2

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lk8/a;->b()I

    move-result v0

    invoke-virtual {p1}, Lk8/a;->b()I

    move-result p1

    if-le v0, p1, :cond_1

    :goto_0
    return v2
.end method


# virtual methods
.method public final h(Lm8/e;)Z
    .locals 3

    .prologue
    const-string v0, "metadataVersionFromLanguageVersion"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lk8/a;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lk8/a;->b()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lm8/e;->i:Lm8/e;

    invoke-virtual {v0}, Lk8/a;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lk8/a;->b()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    iget-boolean v0, p0, Lm8/e;->g:Z

    invoke-virtual {p1, v0}, Lm8/e;->k(Z)Lm8/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lm8/e;->i(Lm8/e;)Z

    move-result p1

    return p1
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lm8/e;->g:Z

    return v0
.end method

.method public final k(Z)Lm8/e;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    sget-object p1, Lm8/e;->i:Lm8/e;

    goto :goto_0

    :cond_0
    sget-object p1, Lm8/e;->j:Lm8/e;

    :goto_0
    invoke-direct {p1, p0}, Lm8/e;->l(Lm8/e;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, p0

    :goto_1
    return-object p1
.end method

.method public final m()Lm8/e;
    .locals 5

    .prologue
    invoke-virtual {p0}, Lk8/a;->a()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lk8/a;->b()I

    move-result v0

    const/16 v3, 0x9

    if-ne v0, v3, :cond_0

    new-instance v0, Lm8/e;

    const/4 v2, 0x2

    filled-new-array {v2, v1, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, Lm8/e;-><init>([I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lm8/e;

    invoke-virtual {p0}, Lk8/a;->a()I

    move-result v3

    invoke-virtual {p0}, Lk8/a;->b()I

    move-result v4

    add-int/2addr v4, v2

    filled-new-array {v3, v4, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, Lm8/e;-><init>([I)V

    :goto_0
    return-object v0
.end method
