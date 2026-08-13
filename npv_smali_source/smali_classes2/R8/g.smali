.class final LR8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;


# instance fields
.field private final a:Lx7/a;

.field private final b:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/a;Lx7/l;)V
    .locals 1

    const-string v0, "getInitialValue"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextValue"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR8/g;->a:Lx7/a;

    iput-object p2, p0, LR8/g;->b:Lx7/l;

    return-void
.end method

.method public static final synthetic b(LR8/g;)Lx7/a;
    .locals 0

    iget-object p0, p0, LR8/g;->a:Lx7/a;

    return-object p0
.end method

.method public static final synthetic c(LR8/g;)Lx7/l;
    .locals 0

    iget-object p0, p0, LR8/g;->b:Lx7/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LR8/g$a;

    invoke-direct {v0, p0}, LR8/g$a;-><init>(LR8/g;)V

    return-object v0
.end method
