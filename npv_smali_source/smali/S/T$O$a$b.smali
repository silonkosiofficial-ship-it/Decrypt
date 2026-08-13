.class final LS/T$O$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$O$a;->a(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/T$O$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/T$O$a$b;

    invoke-direct {v0}, LS/T$O$a$b;-><init>()V

    sput-object v0, LS/T$O$a$b;->D:LS/T$O$a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/T$O$a$b;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
