.class final Lj7/d$d;
.super Lj7/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final D:Lj7/d;

.field private final E:I

.field private F:I


# direct methods
.method public constructor <init>(Lj7/d;II)V
    .locals 1

    const-string v0, "list"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj7/d;-><init>()V

    iput-object p1, p0, Lj7/d$d;->D:Lj7/d;

    iput p2, p0, Lj7/d$d;->E:I

    sget-object v0, Lj7/d;->C:Lj7/d$a;

    invoke-virtual {p1}, Lj7/b;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lj7/d$a;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Lj7/d$d;->F:I

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    iget v0, p0, Lj7/d$d;->F:I

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lj7/d;->C:Lj7/d$a;

    iget v1, p0, Lj7/d$d;->F:I

    invoke-virtual {v0, p1, v1}, Lj7/d$a;->b(II)V

    iget-object v0, p0, Lj7/d$d;->D:Lj7/d;

    iget v1, p0, Lj7/d$d;->E:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lj7/d;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
