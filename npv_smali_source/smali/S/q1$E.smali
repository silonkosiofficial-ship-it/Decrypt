.class final LS/q1$E;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->t(LS/c;Landroidx/compose/ui/d;LS/o1;ZLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/q1$E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/q1$E;

    invoke-direct {v0}, LS/q1$E;-><init>()V

    sput-object v0, LS/q1$E;->D:LS/q1$E;

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

    invoke-static {p1, v0}, LK0/u;->k0(LK0/w;Z)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/q1$E;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
