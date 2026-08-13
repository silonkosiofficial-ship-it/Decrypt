.class final LS/T$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->a(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;LS/M;LM0/P;FLx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/T$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/T$a;

    invoke-direct {v0}, LS/T$a;-><init>()V

    sput-object v0, LS/T$a;->D:LS/T$a;

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

    const/4 v0, 0x1

    invoke-static {p1, v0}, LK0/u;->N(LK0/w;Z)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/T$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
