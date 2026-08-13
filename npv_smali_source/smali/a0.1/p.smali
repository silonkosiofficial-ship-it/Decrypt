.class public final La0/p;
.super Lj7/k;
.source "SourceFile"

# interfaces
.implements LY/e;


# instance fields
.field private final D:La0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(La0/d;)V
    .locals 0

    invoke-direct {p0}, Lj7/k;-><init>()V

    iput-object p1, p0, La0/p;->D:La0/d;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, La0/p;->D:La0/d;

    invoke-virtual {v0, p1}, La0/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, La0/p;->D:La0/d;

    invoke-virtual {v0}, Lj7/f;->size()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, La0/q;

    iget-object v1, p0, La0/p;->D:La0/d;

    invoke-virtual {v1}, La0/d;->r()La0/t;

    move-result-object v1

    invoke-direct {v0, v1}, La0/q;-><init>(La0/t;)V

    return-object v0
.end method
