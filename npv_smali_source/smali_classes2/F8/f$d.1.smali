.class final LF8/f$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/f;-><init>(LE8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF8/f$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/f$d;

    invoke-direct {v0}, LF8/f$d;-><init>()V

    sput-object v0, LF8/f$d;->D:LF8/f$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Z)LF8/f$b;
    .locals 1

    new-instance p1, LF8/f$b;

    sget-object v0, LH8/k;->a:LH8/k;

    invoke-virtual {v0}, LH8/k;->l()LF8/E;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p1, v0}, LF8/f$b;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, LF8/f$d;->a(Z)LF8/f$b;

    move-result-object p1

    return-object p1
.end method
