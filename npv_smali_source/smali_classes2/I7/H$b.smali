.class final LI7/H$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/H;->d(LO7/y;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LI7/H$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/H$b;

    invoke-direct {v0}, LI7/H$b;-><init>()V

    sput-object v0, LI7/H$b;->D:LI7/H$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/j0;)Ljava/lang/CharSequence;
    .locals 2

    sget-object v0, LI7/H;->a:LI7/H;

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    const-string v1, "getType(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LI7/H;->h(LF8/E;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/j0;

    invoke-virtual {p0, p1}, LI7/H$b;->a(LO7/j0;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
