.class final Lr0/c$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/c;-><init>(Lr0/e;Lr0/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lr0/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/c$c;

    invoke-direct {v0}, Lr0/c$c;-><init>()V

    sput-object v0, Lr0/c$c;->D:Lr0/c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, Lr0/c$c;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
