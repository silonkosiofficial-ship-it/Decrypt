.class public final LV/H1;
.super LV/O0;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/a;)V
    .locals 0

    invoke-direct {p0, p1}, LV/O0;-><init>(Lx7/a;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)LV/P0;
    .locals 9

    .prologue
    new-instance v8, LV/P0;

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, LV/P0;-><init>(LV/w;Ljava/lang/Object;ZLV/u1;LV/w0;Lx7/l;Z)V

    return-object v8
.end method
