.class public abstract La9/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lx7/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, La9/w$a;->L:La9/w$a;

    const-string v1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/q;

    sput-object v0, La9/w;->a:Lx7/q;

    return-void
.end method

.method public static final synthetic a()Lx7/q;
    .locals 1

    sget-object v0, La9/w;->a:Lx7/q;

    return-object v0
.end method
