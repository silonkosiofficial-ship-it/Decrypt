.class public final Lh2/r$c;
.super Lh2/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/r$c$a;
    }
.end annotation


# static fields
.field public static final b:Lh2/r$c$a;

.field private static final c:Lh2/r$c;

.field private static final d:Lh2/r$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh2/r$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh2/r$c$a;-><init>(Ly7/k;)V

    sput-object v0, Lh2/r$c;->b:Lh2/r$c$a;

    new-instance v0, Lh2/r$c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh2/r$c;-><init>(Z)V

    sput-object v0, Lh2/r$c;->c:Lh2/r$c;

    new-instance v0, Lh2/r$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh2/r$c;-><init>(Z)V

    sput-object v0, Lh2/r$c;->d:Lh2/r$c;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lh2/r;-><init>(ZLy7/k;)V

    return-void
.end method

.method public static final synthetic b()Lh2/r$c;
    .locals 1

    sget-object v0, Lh2/r$c;->c:Lh2/r$c;

    return-object v0
.end method

.method public static final synthetic c()Lh2/r$c;
    .locals 1

    sget-object v0, Lh2/r$c;->d:Lh2/r$c;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Lh2/r$c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh2/r;->a()Z

    move-result v0

    check-cast p1, Lh2/r$c;

    invoke-virtual {p1}, Lh2/r;->a()Z

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lh2/r;->a()Z

    move-result v0

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NotLoading(endOfPaginationReached="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lh2/r;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
