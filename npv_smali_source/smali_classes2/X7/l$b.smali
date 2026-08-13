.class final LX7/l$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX7/l;->b(LO7/a;LO7/a;LO7/e;)Lr8/g$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LX7/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX7/l$b;

    invoke-direct {v0}, LX7/l$b;-><init>()V

    sput-object v0, LX7/l$b;->D:LX7/l$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/j0;)LF8/E;
    .locals 0

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/j0;

    invoke-virtual {p0, p1}, LX7/l$b;->a(LO7/j0;)LF8/E;

    move-result-object p1

    return-object p1
.end method
