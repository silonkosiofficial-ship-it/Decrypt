.class public abstract Lb1/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:[LF7/k;

.field private static final b:LK0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/A;

    const-string v1, "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"

    const/4 v2, 0x1

    const-class v3, Lb1/A;

    const-string v4, "designInfoProvider"

    invoke-direct {v0, v3, v4, v1, v2}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v0

    new-array v1, v2, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lb1/A;->a:[LF7/k;

    new-instance v0, LK0/v;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "DesignInfoProvider"

    invoke-direct {v0, v3, v1, v2, v1}, LK0/v;-><init>(Ljava/lang/String;Lx7/p;ILy7/k;)V

    sput-object v0, Lb1/A;->b:LK0/v;

    return-void
.end method

.method public static final a(LK0/w;Lb1/q;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb1/A;->b:LK0/v;

    sget-object v1, Lb1/A;->a:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LK0/v;->d(LK0/w;LF7/k;Ljava/lang/Object;)V

    return-void
.end method
