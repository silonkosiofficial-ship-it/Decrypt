.class public abstract Lj4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO3/a$g;

.field public static final b:LO3/a$g;

.field public static final c:LO3/a$a;

.field static final d:LO3/a$a;

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:LO3/a;

.field public static final h:LO3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LO3/a$g;

    invoke-direct {v0}, LO3/a$g;-><init>()V

    sput-object v0, Lj4/d;->a:LO3/a$g;

    new-instance v1, LO3/a$g;

    invoke-direct {v1}, LO3/a$g;-><init>()V

    sput-object v1, Lj4/d;->b:LO3/a$g;

    new-instance v2, Lj4/b;

    invoke-direct {v2}, Lj4/b;-><init>()V

    sput-object v2, Lj4/d;->c:LO3/a$a;

    new-instance v3, Lj4/c;

    invoke-direct {v3}, Lj4/c;-><init>()V

    sput-object v3, Lj4/d;->d:LO3/a$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lj4/d;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lj4/d;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, LO3/a;

    const-string v5, "SignIn.API"

    invoke-direct {v4, v5, v2, v0}, LO3/a;-><init>(Ljava/lang/String;LO3/a$a;LO3/a$g;)V

    sput-object v4, Lj4/d;->g:LO3/a;

    new-instance v0, LO3/a;

    const-string v2, "SignIn.INTERNAL_API"

    invoke-direct {v0, v2, v3, v1}, LO3/a;-><init>(Ljava/lang/String;LO3/a$a;LO3/a$g;)V

    sput-object v0, Lj4/d;->h:LO3/a;

    return-void
.end method
