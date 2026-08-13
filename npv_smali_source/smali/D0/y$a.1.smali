.class final LD0/y$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/y;->a(Landroidx/compose/ui/d;Lx7/p;LD0/I;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LD0/y$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD0/y$a;

    invoke-direct {v0}, LD0/y$a;-><init>()V

    sput-object v0, LD0/y$a;->D:LD0/y$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LF0/J;->A1(Z)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    invoke-virtual {p0, p1}, LD0/y$a;->a(LF0/J;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
