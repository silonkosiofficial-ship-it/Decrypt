.class public final LX0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX0/r$a;
    }
.end annotation


# static fields
.field public static final c:LX0/r$a;

.field private static final d:LX0/r;


# instance fields
.field private final a:J

.field private final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LX0/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX0/r$a;-><init>(Ly7/k;)V

    sput-object v0, LX0/r;->c:LX0/r$a;

    new-instance v0, LX0/r;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LX0/r;-><init>(JJILy7/k;)V

    sput-object v0, LX0/r;->d:LX0/r;

    return-void
.end method

.method private constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LX0/r;->a:J

    iput-wide p3, p0, LX0/r;->b:J

    return-void
.end method

.method public synthetic constructor <init>(JJILy7/k;)V
    .locals 7

    .prologue
    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    invoke-static {v0}, LY0/y;->f(I)J

    move-result-wide p1

    :cond_0
    move-wide v2, p1

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    invoke-static {v0}, LY0/y;->f(I)J

    move-result-wide p3

    :cond_1
    move-wide v4, p3

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, LX0/r;-><init>(JJLy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(JJLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LX0/r;-><init>(JJ)V

    return-void
.end method

.method public static final synthetic a()LX0/r;
    .locals 1

    sget-object v0, LX0/r;->d:LX0/r;

    return-object v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-wide v0, p0, LX0/r;->a:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, LX0/r;->b:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LX0/r;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, LX0/r;->a:J

    check-cast p1, LX0/r;

    iget-wide v5, p1, LX0/r;->a:J

    invoke-static {v3, v4, v5, v6}, LY0/x;->e(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LX0/r;->b:J

    iget-wide v5, p1, LX0/r;->b:J

    invoke-static {v3, v4, v5, v6}, LY0/x;->e(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LX0/r;->a:J

    invoke-static {v0, v1}, LY0/x;->i(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LX0/r;->b:J

    invoke-static {v1, v2}, LY0/x;->i(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextIndent(firstLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LX0/r;->a:J

    invoke-static {v1, v2}, LY0/x;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", restLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LX0/r;->b:J

    invoke-static {v1, v2}, LY0/x;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
