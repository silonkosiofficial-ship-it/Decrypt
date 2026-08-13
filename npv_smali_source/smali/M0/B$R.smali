.class final LM0/B$R;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$R;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$R;

    invoke-direct {v0}, LM0/B$R;-><init>()V

    sput-object v0, LM0/B$R;->D:LM0/B$R;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LM0/U;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p2}, LM0/U;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LM0/U;

    invoke-virtual {p0, p1, p2}, LM0/B$R;->a(Le0/l;LM0/U;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
