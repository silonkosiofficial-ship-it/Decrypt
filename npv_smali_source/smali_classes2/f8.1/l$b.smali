.class final Lf8/l$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/l;->f(LO7/b;La8/g;)LO7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lf8/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf8/l$b;

    invoke-direct {v0}, Lf8/l$b;-><init>()V

    sput-object v0, Lf8/l$b;->D:Lf8/l$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/b;)LF8/E;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->v0()LO7/X;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    const-string v0, "getType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, Lf8/l$b;->a(LO7/b;)LF8/E;

    move-result-object p1

    return-object p1
.end method
