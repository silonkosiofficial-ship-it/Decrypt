.class final LS/T$O$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$O;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/T$O$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/T$O$a;

    invoke-direct {v0}, LS/T$O$a;-><init>()V

    sput-object v0, LS/T$O$a;->D:LS/T$O$a;

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
    .locals 7

    new-instance v6, LK0/i;

    sget-object v1, LS/T$O$a$a;->D:LS/T$O$a$a;

    sget-object v2, LS/T$O$a$b;->D:LS/T$O$a$b;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LK0/i;-><init>(Lx7/a;Lx7/a;ZILy7/k;)V

    invoke-static {p1, v6}, LK0/u;->m0(LK0/w;LK0/i;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/T$O$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
