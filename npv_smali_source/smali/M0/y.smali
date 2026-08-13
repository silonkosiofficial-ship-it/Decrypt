.class public final LM0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM0/y$a;
    }
.end annotation


# static fields
.field public static final c:LM0/y$a;

.field private static final d:LM0/y;


# instance fields
.field private final a:Z

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM0/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM0/y$a;-><init>(Ly7/k;)V

    sput-object v0, LM0/y;->c:LM0/y$a;

    new-instance v0, LM0/y;

    invoke-direct {v0}, LM0/y;-><init>()V

    sput-object v0, LM0/y;->d:LM0/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    sget-object v0, LM0/g;->b:LM0/g$a;

    invoke-virtual {v0}, LM0/g$a;->b()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, LM0/y;-><init>(IZLy7/k;)V

    return-void
.end method

.method private constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, LM0/y;->a:Z

    iput p1, p0, LM0/y;->b:I

    return-void
.end method

.method public synthetic constructor <init>(IZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LM0/y;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LM0/y;->a:Z

    sget-object p1, LM0/g;->b:LM0/g$a;

    invoke-virtual {p1}, LM0/g$a;->b()I

    move-result p1

    iput p1, p0, LM0/y;->b:I

    return-void
.end method

.method public static final synthetic a()LM0/y;
    .locals 1

    sget-object v0, LM0/y;->d:LM0/y;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LM0/y;->b:I

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LM0/y;->a:Z

    return v0
.end method

.method public final d(LM0/y;)LM0/y;
    .locals 0

    .prologue
    if-nez p1, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LM0/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, p0, LM0/y;->a:Z

    check-cast p1, LM0/y;

    iget-boolean v3, p1, LM0/y;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LM0/y;->b:I

    iget p1, p1, LM0/y;->b:I

    invoke-static {v1, p1}, LM0/g;->g(II)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, LM0/y;->a:Z

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LM0/y;->b:I

    invoke-static {v1}, LM0/g;->h(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PlatformParagraphStyle(includeFontPadding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LM0/y;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", emojiSupportMatch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM0/y;->b:I

    invoke-static {v1}, LM0/g;->i(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
