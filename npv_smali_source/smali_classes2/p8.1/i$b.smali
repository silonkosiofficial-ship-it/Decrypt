.class public abstract Lp8/i$b;
.super Lp8/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field private C:Lp8/d;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/a$a;-><init>()V

    sget-object v0, Lp8/d;->C:Lp8/d;

    iput-object v0, p0, Lp8/i$b;->C:Lp8/d;

    return-void
.end method


# virtual methods
.method public final k()Lp8/d;
    .locals 1

    iget-object v0, p0, Lp8/i$b;->C:Lp8/d;

    return-object v0
.end method

.method public abstract l(Lp8/i;)Lp8/i$b;
.end method

.method public final m(Lp8/d;)Lp8/i$b;
    .locals 0

    iput-object p1, p0, Lp8/i$b;->C:Lp8/d;

    return-object p0
.end method
