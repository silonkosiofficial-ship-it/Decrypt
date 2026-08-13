.class final Lq8/c$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lq8/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq8/c$e;

    invoke-direct {v0}, Lq8/c$e;-><init>()V

    sput-object v0, Lq8/c$e;->D:Lq8/c$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq8/f;)V
    .locals 1

    const-string v0, "$this$withOptions"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lq8/f;->i(Z)V

    sget-object v0, Lq8/b$a;->a:Lq8/b$a;

    invoke-interface {p1, v0}, Lq8/f;->a(Lq8/b;)V

    sget-object v0, Lq8/e;->F:Ljava/util/Set;

    invoke-interface {p1, v0}, Lq8/f;->d(Ljava/util/Set;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq8/f;

    invoke-virtual {p0, p1}, Lq8/c$e;->a(Lq8/f;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
