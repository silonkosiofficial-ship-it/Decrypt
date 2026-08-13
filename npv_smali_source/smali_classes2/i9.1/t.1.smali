.class public final Li9/t;
.super Lk9/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/t$a;
    }
.end annotation


# static fields
.field public static final g:Li9/t$a;

.field private static final h:Ljava/util/List;

.field private static final i:Ljava/util/List;


# instance fields
.field private final e:I

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Li9/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li9/t$a;-><init>(Ly7/k;)V

    sput-object v0, Li9/t;->g:Li9/t$a;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    new-array v3, v2, [Ljava/lang/Integer;

    aput-object v1, v3, v0

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v6, 0x3

    aput-object v1, v3, v6

    const/4 v7, 0x4

    aput-object v1, v3, v7

    const/4 v8, 0x5

    aput-object v1, v3, v8

    const/4 v9, 0x6

    aput-object v1, v3, v9

    const/4 v10, 0x7

    aput-object v1, v3, v10

    const/16 v11, 0x8

    aput-object v1, v3, v11

    invoke-static {v3}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sput-object v3, Li9/t;->h:Ljava/util/List;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-array v2, v2, [Ljava/lang/Integer;

    aput-object v3, v2, v0

    aput-object v12, v2, v4

    aput-object v1, v2, v5

    aput-object v3, v2, v6

    aput-object v12, v2, v7

    aput-object v1, v2, v8

    aput-object v3, v2, v9

    aput-object v12, v2, v10

    aput-object v1, v2, v11

    invoke-static {v2}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Li9/t;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(IILjava/util/List;)V
    .locals 1

    const-string v0, "zerosToAdd"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li9/O;->a:Li9/O;

    invoke-virtual {v0}, Li9/O;->a()Lk9/q;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2, p3}, Lk9/k;-><init>(Lk9/n;IILjava/util/List;)V

    iput p1, p0, Li9/t;->e:I

    iput p2, p0, Li9/t;->f:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/List;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, Li9/t;->h:Ljava/util/List;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Li9/t;-><init>(IILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Li9/t;

    if-eqz v0, :cond_0

    iget v0, p0, Li9/t;->e:I

    check-cast p1, Li9/t;

    iget v1, p1, Li9/t;->e:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Li9/t;->f:I

    iget p1, p1, Li9/t;->f:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Li9/t;->e:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Li9/t;->f:I

    add-int/2addr v0, v1

    return v0
.end method
