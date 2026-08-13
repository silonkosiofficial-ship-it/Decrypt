.class public final LZ/i;
.super LZ/a;
.source "SourceFile"


# instance fields
.field private final E:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, LZ/a;-><init>(II)V

    iput-object p1, p0, LZ/i;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZ/a;->b()V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LZ/a;->f(I)V

    iget-object v0, p0, LZ/i;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZ/a;->c()V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LZ/a;->f(I)V

    iget-object v0, p0, LZ/i;->E:Ljava/lang/Object;

    return-object v0
.end method
