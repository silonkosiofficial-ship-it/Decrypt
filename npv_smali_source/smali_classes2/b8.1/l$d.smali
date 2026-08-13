.class final Lb8/l$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/l;->O(LO7/e;Ljava/util/Set;Lx7/l;)Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lb8/l$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/l$d;

    invoke-direct {v0}, Lb8/l$d;-><init>()V

    sput-object v0, Lb8/l$d;->D:Lb8/l$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/E;)LO7/e;
    .locals 1

    .prologue
    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    instance-of v0, p1, LO7/e;

    if-eqz v0, :cond_0

    check-cast p1, LO7/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/E;

    invoke-virtual {p0, p1}, Lb8/l$d;->a(LF8/E;)LO7/e;

    move-result-object p1

    return-object p1
.end method
