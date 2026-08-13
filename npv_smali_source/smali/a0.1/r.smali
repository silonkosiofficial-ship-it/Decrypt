.class public final La0/r;
.super Lj7/b;
.source "SourceFile"

# interfaces
.implements LY/b;


# instance fields
.field private final C:La0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(La0/d;)V
    .locals 0

    invoke-direct {p0}, Lj7/b;-><init>()V

    iput-object p1, p0, La0/r;->C:La0/d;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, La0/r;->C:La0/d;

    invoke-virtual {v0, p1}, Lj7/f;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, La0/r;->C:La0/d;

    invoke-virtual {v0}, Lj7/f;->size()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, La0/s;

    iget-object v1, p0, La0/r;->C:La0/d;

    invoke-virtual {v1}, La0/d;->r()La0/t;

    move-result-object v1

    invoke-direct {v0, v1}, La0/s;-><init>(La0/t;)V

    return-object v0
.end method
