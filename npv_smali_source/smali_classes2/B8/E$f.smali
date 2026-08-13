.class final LB8/E$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/E;->t(LB8/E;Li8/q;I)LO7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LB8/E$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LB8/E$f;

    invoke-direct {v0}, LB8/E$f;-><init>()V

    sput-object v0, LB8/E$f;->D:LB8/E$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li8/q;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/q;->U()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/q;

    invoke-virtual {p0, p1}, LB8/E$f;->a(Li8/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
