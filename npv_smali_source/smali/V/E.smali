.class public final LV/E;
.super LV/O0;
.source "SourceFile"


# instance fields
.field private final b:LV/F;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/l;)V
    .locals 1

    sget-object v0, LV/E$a;->D:LV/E$a;

    invoke-direct {p0, v0}, LV/O0;-><init>(Lx7/a;)V

    new-instance v0, LV/F;

    invoke-direct {v0, p1}, LV/F;-><init>(Lx7/l;)V

    iput-object v0, p0, LV/E;->b:LV/F;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LV/M1;
    .locals 1

    invoke-virtual {p0}, LV/E;->g()LV/F;

    move-result-object v0

    return-object v0
.end method

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

    const/4 v7, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, LV/P0;-><init>(LV/w;Ljava/lang/Object;ZLV/u1;LV/w0;Lx7/l;Z)V

    return-object v8
.end method

.method public g()LV/F;
    .locals 1

    iget-object v0, p0, LV/E;->b:LV/F;

    return-object v0
.end method
