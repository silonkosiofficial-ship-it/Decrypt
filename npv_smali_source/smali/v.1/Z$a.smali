.class final Lv/Z$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/Z;->a(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lv/Z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv/Z$a;

    invoke-direct {v0}, Lv/Z$a;-><init>()V

    sput-object v0, Lv/Z$a;->D:Lv/Z$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 1

    sget-object v0, LK0/g;->d:LK0/g$a;

    invoke-virtual {v0}, LK0/g$a;->a()LK0/g;

    move-result-object v0

    invoke-static {p1, v0}, LK0/u;->W(LK0/w;LK0/g;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, Lv/Z$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
