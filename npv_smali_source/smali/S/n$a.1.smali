.class final LS/n$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/n;->a(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/k;LS/m;Lv/g;LA/B;Lz/l;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/n$a;

    invoke-direct {v0}, LS/n$a;-><init>()V

    sput-object v0, LS/n$a;->D:LS/n$a;

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

    sget-object v0, LK0/h;->b:LK0/h$a;

    invoke-virtual {v0}, LK0/h$a;->a()I

    move-result v0

    invoke-static {p1, v0}, LK0/u;->X(LK0/w;I)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/n$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
