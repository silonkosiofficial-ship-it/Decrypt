.class public abstract LB8/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln8/c;

.field public static final b:Ln8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln8/c;

    const-string v1, "kotlin.suspend"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LB8/D;->a:Ln8/c;

    new-instance v0, Ln8/a;

    sget-object v1, LL7/j;->y:Ln8/c;

    const-string v2, "suspend"

    invoke-static {v2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v2

    const-string v3, "identifier(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Ln8/a;-><init>(Ln8/c;Ln8/f;)V

    sput-object v0, LB8/D;->b:Ln8/a;

    return-void
.end method
