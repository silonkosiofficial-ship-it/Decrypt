.class final Lr8/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr8/d;->b(LO7/a;LO7/a;ZZZLG8/g;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lr8/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr8/d$a;

    invoke-direct {v0}, Lr8/d$a;-><init>()V

    sput-object v0, Lr8/d$a;->D:Lr8/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/m;LO7/m;)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/m;

    check-cast p2, LO7/m;

    invoke-virtual {p0, p1, p2}, Lr8/d$a;->a(LO7/m;LO7/m;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
